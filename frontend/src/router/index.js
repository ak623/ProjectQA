import Vue from 'vue';
import Router from 'vue-router';
import ViewAccounts from '@/components/ViewAccounts';
import InsertAccount from '@/components/InsertAccount';
import Home from '@/components/Home';

Vue.use(Router);

export default new Router({
  mode: 'history',
  routes: [
    {
      // thats just the paths
      path: '/ViewAccounts',
      name: 'ViewAccounts',
      component: ViewAccounts,
    },
    {
      path: '/InsertAccount',
      name: 'InsertAccount',
      component: InsertAccount,
    },
    {
      path: '/',
      name: 'Home',
      component: Home,
    },

  ]
})
