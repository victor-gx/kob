<template>
  <div>
    <NavBar />
    <router-view></router-view>
  </div>
</template>

<script>
import NavBar from './components/NavBar.vue'
import "bootstrap/dist/css/bootstrap.min.css"
import "bootstrap/dist/js/bootstrap"
// import $ from 'jquery'

export default {
  components: {
    NavBar
  },
  // setup() {
  //   $.ajax({
  //     url: "http://127.0.0.1:3000/user/account/token/",
  //     type: "post",
  //     data: {
  //       username: "gx",
  //       password: "aaa",
  //     },
  //     success(resp) {
  //       console.log(resp);
  //     },
  //     error(resp) {
  //       console.log(resp);
  //     }
  //   }),
  //   $.ajax({
  //     url: "http://127.0.0.1:3000/user/account/info/",
  //     type: "get",
  //     headers: {
  //       Authoriztion: "Bearer " +"eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIzZDUyNThjNjQzOGU0ZWNiYjAxZGFkYTBhMzY2MjdjYiIsInN1YiI6IjEiLCJpc3MiOiJzZyIsImlhdCI6MTY3MDQ2ODAwMiwiZXhwIjoxNjcxNjc3NjAyfQ.l238oUss0npfU-CrSGlWYj25dEsZo9NA2GTmcTWuIGs"
  //     },
  //     success(resp) {
  //       console.log(resp);
  //     },
  //     error(resp) {
  //       console.log(resp);
  //     }
  //   }),
  //   $.ajax({
  //     url: "http://127.0.0.1:3000/user/account/register/",
  //     type: "post",
  //     data: {
  //       username: "gx2",
  //       password: "123",
  //       confirmedPassword: "123",
  //     },
  //     success(resp) {
  //       console.log(resp);
  //     },
  //     error(resp) {
  //       console.log(resp);
  //     }
  //   })
  // }
}
</script>


<style>
body {
  background-image: url("@/assets/images/background.png");
  background-size: cover;
}
</style>
