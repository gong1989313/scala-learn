package com.gxq.learn.di.service.main

import com.gxq.learn.di.repository.impl.UserRepositoryComponentHibernateImpl
import com.gxq.learn.di.service.impl.UserAuthorizationComponentImpl
import com.gxq.learn.di.model.User

object DIMain1 {
  def main(args: Array[String]): Unit = {
    val env = new UserAuthorizationComponentImpl with UserRepositoryComponentHibernateImpl
    env.userAuthorization.authorize(User("1"))
  }
}