<template>
  <div class="container">
    <table id="tblUsers">
      <thead>
        <tr>
          <th>&nbsp;</th>
          <th>First Name</th>
          <th>Last Name</th>
          <th>Username</th>
          <th>Email Address</th>
          <th>Status</th>
          <th>Actions</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>
            <input
              type="checkbox"
              id="selectAll"
              v-model="selectAll"
              @change="selectAllHandler"
            />
          </td>
          <td>
            <input
              type="text"
              id="firstNameFilter"
              v-model="filter.firstName"
            />
          </td>
          <td>
            <input type="text" id="lastNameFilter" v-model="filter.lastName" />
          </td>
          <td>
            <input type="text" id="usernameFilter" v-model="filter.username" />
          </td>
          <td>
            <input type="text" id="emailFilter" v-model="filter.emailAddress" />
          </td>
          <td>
            <select id="statusFilter" v-model="filter.status">
              <option value="">Show All</option>
              <option value="Active">Active</option>
              <option value="Inactive">Inactive</option>
            </select>
          </td>
          <td>&nbsp;</td>
        </tr>
        <tr
          v-for="user in filteredList"
          v-bind:key="user.id"
          v-bind:class="{ deactivated: user.status === 'Inactive' }"
        >
          <td>
            <input
              type="checkbox"
              v-bind:id="user.id"
              v-bind:value="user.id"
              v-model="selectedIds"
            />
          </td>
          <td>{{ user.firstName }}</td>
          <td>{{ user.lastName }}</td>
          <td>{{ user.username }}</td>
          <td>{{ user.emailAddress }}</td>
          <td>{{ user.status }}</td>
          <td>
            <button
              class="btnActivateDeactivate"
              @click="toggleStatus(user.id)"
            >
              {{ user.status === "Active" ? "Deactivate" : "Activate" }}
            </button>
          </td>
        </tr>
      </tbody>
    </table>
    <div class="all-actions">
      <button :disabled="selectedIds.length === 0" @click="activateUsers">
        Activate Users
      </button>
      <button :disabled="selectedIds.length === 0" @click="deactivateUsers">
        Deactivate Users
      </button>
      <button :disabled="selectedIds.length === 0" @click="deleteUsers">
        Delete Users
      </button>
    </div>
    <button @click="showForm = !showForm">Add New User</button>
   


   
     <a id="show-form-button" href="#" v-on:click.prevent="showForm = true" v-if="showForm === false">
      Show Form
    </a>
    <form id="frmAddNewUser" v-on:submit.prevent="addUser" autocomplete="off" v-show="showForm === true">
   
      <div class="field">
        <label for="firstName">First Name:</label>
        <input type="text" name="firstName" v-model="newUser.firstName" />
      </div>
      <div class="field">
        <label for="lastName">Last Name:</label>
        <input type="text" name="lastName" v-model="newUser.lastName" />
      </div>
      <div class="field">
        <label for="username">Username:</label>
        <input type="text" name="username" v-model="newUser.username" />
      </div>
      <div class="field">
        <label for="emailAddress">Email Address:</label>
        <input type="text" name="emailAddress" v-model="newUser.emailAddress" />
      </div>
     


      <button type="submit" class="btn save">Save User</button>
    </form>
  </div>
</template>
<script>
export default {
  name: "user-list",
  data() {
    return {
      filter: {
        firstName: "",
        lastName: "",
        username: "",
        emailAddress: "",
        status: "",
      },
      nextUserId: 7,
      newUser: {
        id: null,
        firstName: "",
        lastName: "",
        username: "",
        emailAddress: "",
        status: "Active",
      },
      users: [
        {
          id: 1,
          firstName: "John",
          lastName: "Smith",
          username: "jsmith",
          emailAddress: "jsmith@gmail.com",
          status: "Active",
        },
        {
          id: 2,
          firstName: "Anna",
          lastName: "Bell",
          username: "abell",
          emailAddress: "abell@yahoo.com",
          status: "Active",
        },
        {
          id: 3,
          firstName: "George",
          lastName: "Best",
          username: "gbest",
          emailAddress: "gbest@gmail.com",
          status: "Inactive",
        },
        {
          id: 4,
          firstName: "Ben",
          lastName: "Carter",
          username: "bcarter",
          emailAddress: "bcarter@gmail.com",
          status: "Active",
        },
        {
          id: 5,
          firstName: "Katie",
          lastName: "Jackson",
          username: "kjackson",
          emailAddress: "kjackson@yahoo.com",
          status: "Active",
        },
        {
          id: 6,
          firstName: "Mark",
          lastName: "Smith",
          username: "msmith",
          emailAddress: "msmith@foo.com",
          status: "Inactive",
        },
      ],
      selectedIds: [],
      showForm: false,
    };
  },


 
  methods: {
    getNextUserId() {
      return this.nextUserId++;
    },
    toggleStatus(id) {
      const user = this.users.find((user) => user.id === id);
      user.status = user.status === "Active" ? "Inactive" : "Active";
    },
    activateUsers() {
      this.selectedIds.forEach((id) => {
        const user = this.users.find((user) => user.id === id);
        user.status = "Active";
      });
      this.selectedIds = [];
    },
    deactivateUsers() {
      this.selectedIds.forEach((id) => {
        const user = this.users.find((user) => user.id === id);
        user.status = "Inactive";
      });
      this.selectedIds = [];
    },
    deleteUsers() {
      this.selectedIds.forEach((id) => {
        const index = this.users.findIndex((user) => user.id === id);
        this.users.splice(index, 1);
      });
      this.selectedIds = [];
    },
    addUser() {
      this.newUser.id = this.getNextUserId();
      this.users.push(this.newUser);
      this.newUser = {
        id: null,
        firstName: "",
        lastName: "",
        username: "",
        emailAddress: "",
        status: "Active",
      };
      this.showForm = false;
    },
 
     toggleUserStatus(id) {
    const user = this.users.find(user => user.id === id);
    user.status = user.status === 'Active' ? 'Inactive' : 'Active';
  }
  },
 
  computed: {
    filteredList() {
      let filteredUsers = this.users;
      if (this.filter.firstName != "") {
        filteredUsers = filteredUsers.filter((user) =>
          user.firstName
            .toLowerCase()
            .includes(this.filter.firstName.toLowerCase())
        );
      }
      if (this.filter.lastName != "") {
        filteredUsers = filteredUsers.filter((user) =>
          user.lastName
            .toLowerCase()
            .includes(this.filter.lastName.toLowerCase())
        );
      }
      if (this.filter.username != "") {
        filteredUsers = filteredUsers.filter((user) =>
          user.username
            .toLowerCase()
            .includes(this.filter.username.toLowerCase())
        );
      }
      if (this.filter.emailAddress != "") {
        filteredUsers = filteredUsers.filter((user) =>
          user.emailAddress
            .toLowerCase()
            .includes(this.filter.emailAddress.toLowerCase())
        );
      }
      if (this.filter.status != "") {
        filteredUsers = filteredUsers.filter(
          (user) => user.status === this.filter.status
        );
      }
      return filteredUsers;
    },
    selectAll: {
      get() {
        return this.selectedIds.length === this.filteredList.length;
      },
      set(value) {
        if (value) {
          this.selectedIds = this.filteredList.map((user) => user.id);
        } else {
          this.selectedIds = [];
        }
      },
    },
    isAnySelected() {
      return this.selectedIds.length > 0;
    },
    isAllSelected() {
      return this.selectedIds.length === this.filteredList.length;
    },
  },
};
</script>
<style scoped>
table {
  margin-top: 20px;
  font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, Oxygen,
    Ubuntu, Cantarell, "Open Sans", "Helvetica Neue", sans-serif;
  margin-bottom: 20px;
}
th {
  text-transform: uppercase;
}
td {
  padding: 10px;
}
tr.deactivated {
  color: red;
}
input,
select {
  font-size: 16px;
}
form {
  margin: 20px;
  width: 350px;
}
.field {
  padding: 10px 0px;
}
label {
  width: 140px;
  display: inline-block;
}
button {
  margin-right: 5px;
}
.all-actions {
  margin-bottom: 40px;
}
.btn.save {
  margin: 20px;
  float: right;
}
</style>