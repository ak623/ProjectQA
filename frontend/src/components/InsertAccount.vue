<template>
  <div class="container">

    <form>

      <div class="well">
        <h4> Add User</h4>
        <div class="form-group">
          <label class="pull-left"> ID </label>
          <input type="text" class="form-control" placeholder="First Name" v-model="User.id">
        </div>
        <div class="form-group">
          <label class="pull-left"> First Name </label>
          <input type="text" class="form-control" placeholder="First Name" v-model="User.firstName">
        </div>
        <div class="form-group">
          <label class="pull-left"> Last Name </label>
          <input type="text" class="form-control" placeholder="Last Name " v-model="User.secondName">
        </div>
        <div class="form-group">
          <label class="pull-left"> Account Number </label>
          <input type="text" class="form-control" placeholder="Account Number " v-model="User.accountNumber">
        </div>
      </div>

      <button type="submit" class="btn btn-large btn-block btn-primary full-width" @click="addToAPI">Submit</button>
      <button class="btn btn-large btn-block btn-success full-width" @click="addToAPI">Go User</button>
    </form>

  </div>
</template>

<script>
  // import axios from 'axios';
  export default {
    name: 'InsertAccount',
    data() {
      return {
        msg: 'Welcome to Your Vue.js App',
        Account: { id: '', firstName: '', secondName: '', accountNumber: '' },
      }
    }, methods: {
      addToAPI() {
        let newAccount = {
          id: this.User.id,
          firstName: this.User.firstName,
          secondName: this.User.secondName,
          accountNumber: this.User.accountNumber
        }
        console.log(newAccount);
        // axios.post('http://localhost:3000/users', newUser)
        //   .then((response) => {
        //     console.log(response);
        //   })
        //   .catch((error) => {
        //     console.log(error);
        //   });
      }
    }
  }
</script>

<style scoped>

</style>
