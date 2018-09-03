<template>
  <div>
    <div id="body">

    </div>
    <div id="test">
    <NavBar></NavBar>
      <div style="margin-top: 50px; width: 90%; margin: auto;">
        <router-link to="/ViewAccounts"><button class="icon view" > <span class="span">View Accounts</span></button></router-link>
        <router-link to="/AddAccount"><button class="icon add" > <span class="span">Add  Account</span></button></router-link>
      </div>
    </div>
  </div>
</template>

<script>
  import NavBar from './NavBar.vue'
    export default {
        name: "Home",
      components: {
        NavBar
      },
    }
</script>

<style scoped>

.icon{
  width: 40%;
  background-repeat: no-repeat;
  background-size: 100%;
  float: left;
  margin-left: 5%;
  margin-top: 5%;
  border: none;
  height: 300px;
}

.icon:hover{
  background-color: white;
  -ms-transform: scale(1.5); /* IE 9 */
  -webkit-transform: scale(1.5); /* Safari 3-8 */
  transform: scale(1.1);
}

.icon.view{
  background-image: url("../assets/ViewAll.jpg");
}

.centered {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
}

.icon.edit{
  background-image: url("../assets/Edit.png");
}

.icon.delete{
  background-image: url("../assets/delete.png");
}

.icon.add{
  background-image: url("../assets/Add.jpg");
}

#body{
  background-image: url("../assets/backGrounnd.jpg");
  background-repeat: no-repeat;
  background-size: cover;
  background-size: contain;
  width: 100%;
  height: 1000px;
  background-position: center;
  background-size: cover;
  -webkit-filter: blur(5px);
  -moz-filter: blur(5px);
  -o-filter: blur(5px);
  -ms-filter: blur(5px);
  filter: blur(5px);
  opacity: 0.7;
}

  #test{
    width: 100%;
    height: 100%;
    position: absolute;
    top: 0;
    left: 0;
  }


  .span{
    width: 100%;
    background-color: #000000bf;
    color: white;
    padding-top: 10px;
    padding-bottom: 10px;
    float: left;
    margin-top: 200px;
  }

.span:hover {
  transition: .5s ease;
  background-color: red;
}


.icon:hover .span {
  transition: .5s ease;
  background-color: red;
}
</style>
