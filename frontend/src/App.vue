

<template>
  <div>
    <router-view/>
  </div>
</template>

<script>
  /* eslint-disable */
  import Vue from 'vue';
  import BootstrapVue from 'bootstrap-vue';
  import 'bootstrap/dist/css/bootstrap.css';
  import 'bootstrap-vue/dist/bootstrap-vue.css';
  import NavBar from './components/NavBar.vue'
  Vue.use(BootstrapVue);
  import axios from 'axios';
  export default {
    name: 'App'
  };

</script>

<style>
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


</style>

