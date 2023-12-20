<template>
    <div id="forgot-password">
      <div class="bg"></div>
      <el-row class="main-container">
        <el-col :lg="8" :xs="16" :md="10" :span="10">
          <div class="top">
            <div class="logo">
              <img src="../../assets/img/logo.png" alt="">
            </div>
            <i class="iconfont icon-kaoshi"></i><span class="title">找回密码</span>
          </div>
          <div class="bottom">
            <div class="container">
              <p class="title">找回密码</p>
              <el-form :label-position="labelPosition" label-width="80px" :model="formLabelAlign">
                <el-form-item label="手机号">
                  <el-input v-model="formLabelAlign.phome" placeholder="请输入注册手机号"></el-input>
                </el-form-item>
                <div class="submit">
                  <el-button type="primary" class="reset-password" @click="resetPassword">重置密码</el-button>
                </div>
                <div class="options">
                  <p class="login"><a href="javascript:;" @click="goToLogin">返回登录</a></p>
                </div>
              </el-form>
            </div>
          </div>
        </el-col>
      </el-row>
    </div>
  </template>

  <script>
  import { mapState } from 'vuex';

  export default {
    name: "forgot-password",
    data() {
      return {
        labelPosition: 'left',
        formLabelAlign: {
          email: '',
        },
      };
    },
    methods: {
      // 密码重置请求后台处理
      resetPassword() {
        console.log("重置密码操作执行-------");
        // 向后端发送重置密码请求，根据后端API的实际情况进行配置
        // 处理重置密码响应，可以显示成功或失败消息
      },
      goToLogin() {
        this.$router.push({ path: '/' }); // '/login' 是登录页面的路由路径
      },
    },
    computed: mapState(["userInfo"]),
    mounted() {
    }
  };
  </script>

  <style lang="less" scoped>
  #forgot-password {
    font-size: 14px;
    color: #000;
    background-color: #fff;
    position: relative;
  }

  #forgot-password .logo {
    position: absolute;
    top: 10px;
    left: 10px;
  }

  #forgot-password .logo img {
    height: 80px;
    width: auto;
  }

  #forgot-password .bg {
    position: fixed;
    top: 0;
    left: 0;
    width: 100%;
    overflow-y: auto;
    height: 100%;
    background: url('../../assets/img/loginbg.jpg') center top / cover no-repeat;
    background-color: #b6bccdd1 !important;
  }

  #forgot-password .main-container {
    display: flex;
    justify-content: center;
    align-items: center;
  }

  #forgot-password .main-container .top {
    margin-top: 100px;
    font-size: 30px;
    color: #ff962a;
    display: flex;
    justify-content: center;
  }

  #forgot-password .top .icon-kaoshi {
    font-size: 80px;
  }

  #forgot-password .top .title {
    margin-top: 20px;
  }

  #forgot-password .bottom {
    display: flex;
    justify-content: center;
    background-color: rgba(173, 216, 230, 0.75);
    border-radius: 15px;
    box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
  }

  #forgot-password .bottom .title {
    text-align: center;
    font-size: 30px;
  }

  .bottom .container .title {
    margin: 30px 0px;
  }

  .bottom .submit .reset-password {
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

  .options {
    margin-bottom: 40px;
    color: #ff962a;
    display: flex;
    justify-content: space-between;
  }

  .options > a {
    color: #ff962a;
  }

  .options .login span:nth-child(1) {
    color: #8C8C8C;
  }
  </style>

