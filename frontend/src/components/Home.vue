<template>
  <div>
    <div id="body">

    </div>
    <div id="test">
    <NavBar></NavBar>
      <div style="margin-top: 50px; width: 90%; margin: auto;">
        <router-link to="/ViewAccounts"><button class="icon view" > <span class="span">View Accounts</span></button></router-link>
        <router-link to="/InsertAccount"><button class="icon add" > <span class="span">Insert Account</span></button></router-link>
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
  background-color: rgba(255, 255, 255, 0.5);
  width: 40%;
  height: 300px;
  background-repeat: no-repeat;
  background-size: 100%;
  background-position: 50%;
  float: left;
  margin-left: 5%;
  margin-top: 5%;
  border: none;
}

.icon:hover{
  background-color: white;
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

</style>
