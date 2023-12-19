<template>
    <div id="registration">
      <div class="bg"></div>
      <el-row class="main-container">
        <el-col :lg="8" :xs="16" :md="10" :span="10">
          <div class="top">
            <div class="logo">
              <img src="../../assets/img/logo.png" alt="">
            </div>
            <i class="iconfont icon-kaoshi"></i><span class="title">用户注册</span>
          </div>
          <div class="bottom">
            <div class="container">
              <p class="title">填写注册信息</p>
              <el-form :label-position="labelPosition" label-width="80px" :model="formLabelAlign">
                <el-form-item label="用户名">
                  <el-input v-model.number="formLabelAlign.username" placeholder="请输入用户名"></el-input>
                </el-form-item>
                <el-form-item label="邮箱">
                  <el-input v-model.number="formLabelAlign.email" placeholder="请输入邮箱"></el-input>
                </el-form-item>
                <el-form-item label="密码">
                  <el-input v-model="formLabelAlign.password" placeholder="请输入密码" type='password'></el-input>
                </el-form-item>
                <!-- Add more registration fields as needed -->
                <div class="submit">
                  <el-button type="primary" class="row-register" @click="register()">注册</el-button>
                </div>
                <div class="options">
                    <p class="login"><router-link to="/">已有账号？去登录</router-link></p>
                  </div>
              </el-form>
            </div>
          </div>
        </el-col>
      </el-row>
    </div>
  </template>
  
  <script>
  import { mapState } from 'vuex'
  export default {
    name: "registration",
    data() {
      return {
        labelPosition: 'left',
        formLabelAlign: {
          username: '',
          email: '',
          password: ''
          // Add more fields as needed for registration
        }
      }
    },
    methods: {
      // User registration request to the backend
      register() {
        console.log("注册操作执行-------");
        this.$axios({
          url: `/api/register`, // Update the registration API endpoint
          method: 'post',
          data: {
            ...this.formLabelAlign
          }
        }).then(res => {
          // Handle registration response as needed
          if (res.data.success) {
            // Registration successful, you can redirect to a success page or perform other actions
            this.$router.push({ path: '/success' });
          } else {
            // Registration failed, display error message
            this.$message({
              showClose: true,
              type: 'error',
              message: '注册失败，请检查输入信息'
            });
          }
        });
      }
    },
    computed: mapState(["userInfo"]),
    mounted() {
  
    }
  }
  </script>
  
  <style lang="less" scoped>
#registration {
  font-size: 14px;
  color: #000;
  background-color: #fff;
  position: relative;
}

#registration .logo {
  position: absolute;
  top: 10px;
  left: 10px;
}

#registration .logo img {
  height: 80px;
  width: auto;
}

#registration .bg {
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  overflow-y: auto;
  height: 100%;
  background: url('../../assets/img/loginbg.jpg') center top / cover no-repeat;
  background-color: #b6bccdd1 !important;
}

#registration .main-container {
  display: flex;
  justify-content: center;
  align-items: center;
}

#registration .main-container .top {
  margin-top: 100px;
  font-size: 30px;
  color: #ff962a;
  display: flex;
  justify-content: center;
}

#registration .top .icon-kaoshi {
  font-size: 80px;
}

#registration .top .title {
  margin-top: 20px;
}

#registration .bottom {
  display: flex;
  justify-content: center;
  background-color: rgba(173, 216, 230, 0.75);
  border-radius: 15px;
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
}

#registration .bottom .title {
  text-align: center;
  font-size: 30px;
}

.bottom .container .title {
  margin: 30px 0px;
}

.bottom .submit .row-register {
  width: 100%;
  background-color: #04468b;
  border-color: #04468b;
  margin: 20px 0px 10px 0px;
  padding: 15px 20px;
}

.bottom .submit {
  display: flex;
  justify-content: center;
}

.footer {
  margin-top: 50px;
  text-align: center;
}

.footer .msg1 {
  font-size: 18px;
  color: #fff;
  margin-bottom: 15px;
}

.footer .msg2 {
  font-size: 14px;
  color: #e3e3e3;
  margin-top: 70px;
}

.bottom .options {
  margin-bottom: 40px;
  color: #ff962a;
  display: flex;
  justify-content: space-between;
}

.bottom .options > a {
  color: #ff962a;
}

.bottom .options .login span:nth-child(1) {
  color: #8C8C8C;
}
</style>

  