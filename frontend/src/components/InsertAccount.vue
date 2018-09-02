<template>

  <!--use this to make it look better-->
  <!--https://codepen.io/see8ch/pen/KpLrd-->
  <div>
    <NavBar></NavBar>
  <div id="form">

      <div class="well">
        <h4 style="text-align: center;
    color: orange;"> Add Account</h4>
        <div class="form-group">
          <label class="pull-left"> ID </label>
          <input type="text" class="form-control" placeholder="ID" v-model="Account.id">
        </div>
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


  </div>
  </div>
</template>

<script>
  import axios from 'axios';
  import NavBar from './NavBar.vue'
  export default {
    name: 'InsertAccount',
    components: {
      NavBar
    },
    data() {
      return {
        Account: { id: '', firstName: '', secondName: '', accountNumber: '' },
      }
    }, methods: {
      addAccount() {
        let newAccount = {
          id: this.Account.id,
          firstName: this.Account.firstName,
          secondName: this.Account.secondName,
          accountNumber: this.Account.accountNumber
        }
        console.log(newAccount);
        axios.post('http://localhost:8080/account/add', newAccount)
          .then((response) => {
            // response.header("Access-Control-Allow-Origin", "*");
            this.thisresponse = response.data;
            console.log(response);
          })
          .catch((error) => {
            console.log(error);
          });
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
    width: 70% !important;
    background-color: rgb(219, 224, 226);
    padding-bottom: 50px;
    border-top: 15px solid #313A3D;
    padding-top: 50px;
    margin-top: 50px;
    max-width: 700px;
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
</style>
