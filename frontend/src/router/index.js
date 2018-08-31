import Vue from 'vue';
import Router from 'vue-router';
import HelloWorld from '@/components/HelloWorld';
// import AccountService from '@/components/AccountService';

Vue.use(Router);

export default new Router({
  routes: [
    {
      // thats just the paths
      path: '/s',
      name: 'HelloWorld',
      component: HelloWorld,
    },
    // {
    //   // thats just the paths
    //   path: '/a',
    //   name: 'AccountService',
    //   component: AccountService,
    // },
  ],
});
