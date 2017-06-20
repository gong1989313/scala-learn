package com.gxq.learn.di.service.main

import com.gxq.learn.di.service.impl.UserInformationComponentImpl
import com.gxq.learn.di.model.User
import com.gxq.learn.di.repository.impl.CountryRepositoryComponentImpl

object DIMain2 {
  def main(args: Array[String]): Unit = {
    val env = new UserInformationComponentImpl with CountryRepositoryComponentImpl
    env.userInformation(User("someuser@domain.pl")).userCountry
  }
}