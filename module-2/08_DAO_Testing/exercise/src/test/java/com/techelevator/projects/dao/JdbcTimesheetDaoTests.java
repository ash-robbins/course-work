package com.techelevator.projects.dao;

import com.techelevator.projects.model.Timesheet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

public class JdbcTimesheetDaoTests extends BaseDaoTests {

    private static final Timesheet TIMESHEET_1 = new Timesheet(1, 1, 1,
            LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet 1");
    private static final Timesheet TIMESHEET_2 = new Timesheet(2, 1, 1,
            LocalDate.parse("2021-01-02"), 1.5, true, "Timesheet 2");
    private static final Timesheet TIMESHEET_3 = new Timesheet(3, 2, 1,
            LocalDate.parse("2021-01-01"), 0.25, true, "Timesheet 3");
    private static final Timesheet TIMESHEET_4 = new Timesheet(4, 2, 2,
            LocalDate.parse("2021-02-01"), 2.0, false, "Timesheet 4");


    private Timesheet testTimesheet;
    private JdbcTimesheetDao dao;


    @Before
    public void setup() {
        dao = new JdbcTimesheetDao(dataSource);
        testTimesheet = new Timesheet(50, 1, 1, LocalDate.now(), 5.5, true,"Test Timesheet 0");
    }

//    @Test
    @Test
    public void getTimesheet_returns_correct_timesheet_for_id() {
        Timesheet timesheet = dao.getTimesheet(1);
        Assert.assertNotNull(timesheet);
        assertTimesheetsMatch(TIMESHEET_1, timesheet);

        timesheet = dao.getTimesheet(2);
        Assert.assertNotNull(timesheet);
        assertTimesheetsMatch(TIMESHEET_2, timesheet);



    }

    @Test
    public void getTimesheet_returns_null_when_id_not_found() {
        Timesheet timesheet = dao.getTimesheet(22);
        Assert.assertNull(timesheet);

    }

    @Test
    public void getTimesheetsByEmployeeId_returns_list_of_all_timesheets_for_employee() {
        List<Timesheet> timesheet = dao.getTimesheetsByEmployeeId(1);
        Assert.assertEquals(2, timesheet.size());
        assertTimesheetsMatch(TIMESHEET_1, timesheet.get(0));
        assertTimesheetsMatch(TIMESHEET_2, timesheet.get(1));

        timesheet = dao.getTimesheetsByEmployeeId(2);
        Assert.assertEquals(2, timesheet.size());
        assertTimesheetsMatch(TIMESHEET_3, timesheet.get(2));
        assertTimesheetsMatch(TIMESHEET_4, timesheet.get(3));

    }

    @Test
    public void getTimesheetsByProjectId_returns_list_of_all_timesheets_for_project() {
        List<Timesheet> timesheets = dao.getTimesheetsByProjectId(2);
        Assert.assertEquals(1, timesheets.size());
        assertTimesheetsMatch(TIMESHEET_4, timesheets.get(0));

    }

    @Test
    public void createTimesheet_returns_timesheet_with_id_and_expected_values() {
        Timesheet createdTimesheet = dao.createTimesheet(testTimesheet);

        Integer newId = createdTimesheet.getTimesheetId();
        Assert.assertTrue(newId > 0);

        testTimesheet.setTimesheetId(newId);
        assertTimesheetsMatch(testTimesheet, createdTimesheet);

    }

    @Test
    public void created_timesheet_has_expected_values_when_retrieved() {
        Timesheet createdTimesheet = dao.createTimesheet(testTimesheet);

        Integer newId = createdTimesheet.getTimesheetId();
        Timesheet retrievedTimesheet = dao.getTimesheet(newId);

        assertTimesheetsMatch(createdTimesheet, retrievedTimesheet);

    }

    @Test
    public void updated_timesheet_has_expected_values_when_retrieved() {
        Timesheet timesheetToUpdate = dao.getTimesheet(1);

        timesheetToUpdate.setEmployeeId(00);
        timesheetToUpdate.setProjectId(00);
        timesheetToUpdate.setDateWorked(LocalDate.now());
        timesheetToUpdate.setHoursWorked(200);
        timesheetToUpdate.setBillable(false);
        timesheetToUpdate.setDescription("Test Timesheet");

        Timesheet retrievedTimesheet = dao.getTimesheet(1);
        assertTimesheetsMatch(timesheetToUpdate, retrievedTimesheet);
    }

    @Test
    public void deleted_timesheet_cant_be_retrieved() {
        dao.deleteTimesheet(1);

        Timesheet retrievedTimesheet = dao.getTimesheet(1);
        Assert.assertNull(retrievedTimesheet);

        List<Timesheet> timesheets = dao.getTimesheetsByEmployeeId(1);
        Assert.assertEquals(1, timesheets.size());
        assertTimesheetsMatch(TIMESHEET_3, timesheets.get(0));

    }

    @Test
    public void getBillableHours_returns_correct_total() {
        Double totalBillable = dao.getBillableHours(1, 1);
        Assert.assertEquals("message",2.5, totalBillable,.001);

        totalBillable = dao.getBillableHours(2, 2);
        Assert.assertEquals("message",0, totalBillable,.001);


    }

    private void assertTimesheetsMatch(Timesheet expected, Timesheet actual) {
        Assert.assertEquals(expected.getTimesheetId(), actual.getTimesheetId());
        Assert.assertEquals(expected.getEmployeeId(), actual.getEmployeeId());
        Assert.assertEquals(expected.getProjectId(), actual.getProjectId());
        Assert.assertEquals(expected.getDateWorked(), actual.getDateWorked());
        Assert.assertEquals(expected.getHoursWorked(), actual.getHoursWorked(), 0.001);
        Assert.assertEquals(expected.isBillable(), actual.isBillable());
        Assert.assertEquals(expected.getDescription(), actual.getDescription());
    }

}
