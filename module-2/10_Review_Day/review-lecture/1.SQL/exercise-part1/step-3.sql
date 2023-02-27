-- CAMPGROUND TABLE
-----------------------------------------------

-- select name and daily fee of all campgrounds (expected: 7 rows)
SELECT name, daily_fee FROM campground;
-- select name, open from month, open to month, and daily fee of the campgrounds where daily fee is less than $100 (expected: 5 rows)
SELECT name, open_to_mm, open_from_mm, daily_fee
FROM campground
WHERE daily_fee < '100.00';
-- select name and daily fee of the campgrounds where the campground is open all year long (expected: 4 rows)
SELECT name, daily_fee
FROM campground
WHERE open_from_mm = 1 AND open_to_mm = 12;

-- PARK TABLE
-----------------------------------------------

-- select name and description of all parks order by established date in descending order (expected: 3 rows, startng with "Cuyahoga Valley")

-- select name and description of all parks NOT in Ohio (expected: 2 rows)

-- select the total number of visitors for all parks (expected: around 6 million)

-- select the average number of visitors for all parks (expected: around 2 million)


-- SITE TABLE
-----------------------------------------------

-- select all columns from site where utilities is true and order by max RV length with the largest coming first
-- (expected: 26 rows, starting with 35-foot max_rv_length)

-- select total number of sites that have utilities hook up (expected: around 25)


-- RESERVATION TABLE
-----------------------------------------------


-- select all columns from reservation where name includes 'Reservation' (expected: 23 rows)
SELECT * FROM reservation
WHERE name LIKE '%Reservation';

-- select the total number of reservations in the reservation table (expected: around 40)
SELECT COUNT(*) FROM reservation;
-- select reservation id, site id, name of the reservations where site id is in the list 9, 20, 24, 45, 46 (expected: 16 rows)
SELECT reservation_id, site_id, name
FROM reservation
WHERE site_id IN (9, 20, 24, 45, 46);

-- select the date and number of reservations for each date ordered by from_date in ascending order (expected: 24 rows, starting from the earliest date)

