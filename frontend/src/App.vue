

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




</style>

