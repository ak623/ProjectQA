<template>
    <div>
      <b-navbar toggleable="md" type="dark" variant="info" style="background-color: white !important; box-shadow: 3px 3px grey;">

        <b-navbar-toggle target="nav_collapse"></b-navbar-toggle>

        <img src="https://pbs.twimg.com/profile_images/659323230302416896/znfo0m_W_400x400.jpg" style="
    width:  60px;
    height: 60px;
    margin-right: 20px;
">



        <b-collapse is-nav id="nav_collapse">

          <b-navbar-nav>
            <b-navbar-brand href="#"><router-link to="/" style="color: black">Home</router-link></b-navbar-brand>
          </b-navbar-nav>

          <!-- Right aligned nav items -->
          <b-navbar-nav class="ml-auto">

            <b-nav-form>
              <b-form-input size="sm" style="margin-right: 0px !important;" class="mr-sm-2" type="text" placeholder="Search"/>
              <b-button size="sm" style="margin-left: -5px;
    padding: 4.5px;
    background-color: orange;
    border-color: orange;
    font-weight: bold;" class="my-2 my-sm-0" type="submit">Search</b-button>
            </b-nav-form>

            <b-nav-item-dropdown color="black" style="color: black !important;" text="Account" right>
              <b-dropdown-item href="#">Log out</b-dropdown-item>
            </b-nav-item-dropdown>

          </b-navbar-nav>

        </b-collapse>
      </b-navbar>
    </div>
</template>

<script>
  import Vue from 'vue';
  import BootstrapVue from 'bootstrap-vue';
  import 'bootstrap/dist/css/bootstrap.css';
  import 'bootstrap-vue/dist/bootstrap-vue.css';

  Vue.use(BootstrapVue);
    export default {
        name: "NavBar"
    }
</script>

<style scoped>

  #app {
    font-family: 'Avenir', Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
    margin-top: 60px;
  }

  #__BVID__6:focus, .navbar-nav.ml-auto, .form-inline{
    width: 80% !important;
    float: right !important;
  }

  #__BVID__6:hover{
    width: 80% !important;
    border-bottom: 3px solid orange;
  }

  #__BVID__6:focus{
    width: 80% !important;
    border: 3px solid orange;
  }

  .navbar-dark:hover .navbar-brand:hover{
    border-bottom: 3px solid orange;
  }

  a:hover{
    text-decoration: none !important;
  }

  .navbar-dark .navbar-nav .nav-link_{
    color: rgba(0, 0, 0, 0.5) !important;
  }

  #__BVID__10__BV_button_{
    color: rgba(0, 0, 0, 0.5) !important;
  }
</style>
