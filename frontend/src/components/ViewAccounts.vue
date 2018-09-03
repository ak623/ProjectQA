<template>
    <div>
      <b-modal id="insert">
        <InsertAccount></InsertAccount>
      </b-modal>
      <NavBar></NavBar>
      <div style="width:70%; margin: auto; margin-top: 100px">
        <table class="table">
          <thead class="thead-light">
          <tr>
            <th scope="col">#</th>
            <th scope="col">First</th>
            <th scope="col">Last</th>
            <th scope="col">accountNumber</th>
            <th scope="col">Edit</th>
            <th scope="col">Delete</th>
          </tr>
          </thead>
          <tbody>
          <!--<tr v-for="(account, index) in Accounts" v-bind:index="index">-->
            <tr  v-for="(account, index) in Accounts">
            <th>{{index}}</th>
            <th>{{account.firstName}}</th>
            <th>{{account.secondName}}</th>
            <th>{{account.accountNumber}}</th>
            <th>
              <b-btn v-b-modal.update type="button" @click="updateAccount(account, account.id, index)" class="icon view"></b-btn>
            </th>
            <th><b-btn v-b-modal.delete type="button" @click="deleteAccount(account, account.id, index)" class="icon delete"></b-btn></th>
            <!--<th><button type="button" @click="deleteAccount(account, account.id, account.firstName)" class="icon delete" data-toggle="modal" data-target=".bd-example-modal-sm"></button></th>-->
          </tr>
          </tbody>
        </table>
      </div>
      <div>

        <!-- Modal Component -->
        <b-modal id="update"  title="Update Account" ok-only ok-title="Cancel" cancel-variant="danger" >
          <div>
            <label class="header" id="fname">Fist Name</label>
            <label id="firstName">Current Name: {{Account.firstName}}</label>
            <input type="text"  placeholder="Enter new first name" v-model="AccountToUpdate.firstName">
            <label class="header" id="sname">Surname</label>
            <label id="secondName">Current Surname: {{Account.secondName}}</label>
            <input type="text"  placeholder="Enter new surname" v-model="AccountToUpdate.secondName">
            <label class="header" id="aNo">Account Number</label>
            <label id="accountName">Current Account Number: {{Account.accountNumber}}</label>
            <input type="text"  placeholder="Enter new account number" v-model="AccountToUpdate.accountNumber">
          </div>
          <div>
            <b-btn style="float: left;
    clear: both;
    margin-top: 50px;" @click="confirmUpdate">Update</b-btn>
          </div>
        </b-modal>

        <!-- Modal Component -->
        <b-modal id="delete" ref="test" title="Are you sure?" ok-only ok-title="Cancel">
          <label>Are you sure you want to delete this account?</label>
          <div>
            <b-btn @click="confirmDelete" style="background-color: red; border: none;">Complete Deletion</b-btn>
          </div>
        </b-modal>

      </div>

      <b-btn v-b-modal.insert id="addBtn">+</b-btn>

    </div>
</template>

<script>
  /* eslint-disable */
  import Vue from 'vue';
  import BootstrapVue from 'bootstrap-vue';
  import 'bootstrap/dist/css/bootstrap.css';
  import 'bootstrap-vue/dist/bootstrap-vue.css';
  import NavBar from './NavBar.vue'
  import InsertAccount from './InsertAccount.vue'
  import axios from 'axios';
  Vue.use(BootstrapVue);
  import JQuery from 'jquery'
  let $ = JQuery
    export default {
        name: "ViewAccounts",
      data() {
          return {
            test: null,
            isHidden: current.hidden,
            pageNumber: 0,
            Accounts: [],
            Account: [],
            AccountToUpdate: { id: '', firstName: '', secondName: '', accountNumber: '' }
          }
      },
      components: {
        NavBar,
        InsertAccount
      },
      methods:{
        updateAccount(Accounts, id, name) {
          current.id = id;
          axios.get('http://localhost:8080/account/accountId/' + current.id)
            .then(response => {
              console.log(response.data);
              this.Account = response.data;
            })
            .catch(e => {
              this.errors.push(e)
            })
        },
        confirmUpdate() {
          axios.put('http://localhost:8080/account/update/', {
            id: current.id,
            firstName: this.AccountToUpdate.firstName,
            secondName: this.AccountToUpdate.secondName,
            accountNumber: this.AccountToUpdate.accountNumber
          })
            .then(function (response) {
              window.location.reload();
              console.log(response);
            })
            .catch(function (error) {
              console.log(error);
            });
        },
        deleteAccount(Accounts, id, index) {
          current.id = id;
          current.index = index;
        },
        confirmDelete(){
          this.$refs.test.hide();
          axios.delete('http://localhost:8080/account/delete/' + current.id)
            .then(response => this.Accounts.splice(current.index, 1));
        }
      },
      mounted(){
        axios.get('http://localhost:8080/account/allAccounts')
          .then(response => {
            console.log(response.data);
            this.Accounts = response.data;
          })
          .catch(e => {
            this.errors.push(e)
          })

      }
    }

    // this is how you do a variable known as being reactive
  var current = new Vue({
    data: {
      id: null,
      firstName: null,
      lastName: null,
      surName: null,
      accountNumber: null,
      index: null,
    }
  })


</script>

<style scoped>

  .icon{
    background-color: white;
    width: 60px;
    background-repeat: no-repeat;
    background-size: 50%;
    background-position: 50%;
    float: left;
    margin-left: 5%;
    margin-top: 5%;
    height: 40px;
    border: none;
  }

  .icon:hover{
    background-color: rgb(255, 165, 0);
  }

  .icon.view{
    background-image: url("../assets/Edit.png");
    background-color: #00fd00;
  }

  .icon.delete{
    background-image: url("../assets/delete.png");
    background-size: 25%;
    background-color: #dc3545;
  }

  input[type=text] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    box-sizing: border-box;
  }

  #delete{
    position: fixed;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    width: 50%;
    z-index: 1;
  }

  .deleteContaier{
    background-color: #00000066;
    width: 100%;
    height: 100%;
    top: 0;
    position: absolute
  }

  .icon.view:hover{
    background-color: #d6ffd6;
  }

  .icon.delete:hover{
    background-color: #ff6776;
  }

  label{
    float: left;
    clear: both;
  }

  .header{
    font-weight: bold;
  }

  input{
    width: 100%;
    padding: 1px 20px !important;
    margin: 0px 0px 10px !important;
    -webkit-box-sizing: border-box;
    box-sizing: border-box;
  }
#addBtn {
  position: absolute;
  right: 0;
  bottom: 0;
  background-color: orange;
  transition: 0.3s cubic-bezier(0.25, 0.8, 0.5, 1);
  border-radius: 50%;
  width: 66px;
  border: none;
  margin-right: 20px;
  margin-bottom: 20px;
  color: white;
  font-size: 35px;
  box-shadow: 0px 3px 5px -1px rgba(0,0,0,0.2), 0px 6px 10px 0px rgba(0,0,0,0.14), 0px 1px 18px 0px rgba(0,0,0,0.12);
  }

  #addBtn:hover{
    background-color: #ffce73;
  }

</style>
