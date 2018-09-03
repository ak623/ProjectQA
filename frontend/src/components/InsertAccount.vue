<template>

  <!--use this to make it look better-->
  <!--https://codepen.io/see8ch/pen/KpLrd-->
  <div>
    <!--<NavBar></NavBar>-->
  <div id="form">

      <div class="well">
        <h4 style="text-align: center;
    color: orange;"> Add Account</h4>
        <div class="form-group">
          <label class="pull-left"> First Name </label>
          <input type="text" class="form-control" placeholder="First Name" v-model="Account.firstName">
        </div>
        <div class="form-group">
          <label class="pull-left"> Last Name </label>
          <input type="text" class="form-control" placeholder="Last Name " v-model="Account.secondName">
        </div>
        <div class="form-group">
          <label class="pull-left"> Account Number </label>
          <input type="text" class="form-control" placeholder="Account Number " v-model="Account.accountNumber">
        </div>
      </div>

      <button class="btn" @click="addAccount">Add Account</button>
  <div class="error" v-if="errors.length">
    <b>Please correct the following error(s):</b>
    <ul>
      <li v-for="error in errors">{{ error }}</li>
    </ul>
  </div>

  </div>
  </div>
</template>

<script>
  import axios from 'axios';
  import NavBar from './NavBar.vue'
  import Vue from 'vue';
  export default {
    name: 'InsertAccount',
    components: {
      NavBar
    },
    data() {
      return {
        Account: {  firstName: '', secondName: '', accountNumber: '' },
        errors: [],
      }
    }, methods: {
      addAccount() {
        this.errors = [];

        if (!this.Account.firstName) {
          this.errors.push('Name required.');
        }
        if (!this.Account.secondName) {
          this.errors.push('Second Name required.');
        }
        if (!this.Account.accountNumber) {
          this.errors.push('Account Number required.');
        }

        if (this.Account.firstName && this.Account.secondName && this.Account.accountNumber){
          let newAccount = {
            firstName: this.Account.firstName,
            secondName: this.Account.secondName,
            accountNumber: this.Account.accountNumber
          }
          console.log(newAccount);
          axios.post('http://localhost:8080/account/add', newAccount)
            .then((response) => {
              this.thisresponse = response.data;
              console.log(response);
              window.location.href = '/ViewAccounts';
            })
            .catch((error) => {
              console.log(error);
            });
        }
      }
    }
  }

</script>

<style scoped>
  label{
    color:white;
  }
  #form{
    margin: auto;
    width: 100% !important;
    background-color: rgb(219, 224, 226);
    padding-bottom: 50px;
    border-top: 15px solid #313A3D;
    padding-top: 50px;
  }

  .form-group {
    margin-bottom: 1rem;
    width: 70%;
    margin: auto;
    margin-top: 25px;
  }

  .btn{
    background-color: #FD9638;
    width: 70%;
    display: block;
    margin-top: 25px !important;
    margin: auto;
    border: none;
    color: white;
  }

  .form-control{
    padding: 21px !important;
    border-radius: 0 !important;
  }

  .pull-left{
    background: #313A3D;
    width: 100%;
    padding: 10px;
    text-align: center;
    margin-bottom: 0px;
  }

  .error{
    width: 70%;
    display: block;
    margin-top: 25px !important;
    margin: auto;
    color: #F44336;
  }
</style>
