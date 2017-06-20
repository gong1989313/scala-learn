package com.gxq.learn.di.service

import com.gxq.learn.di.model.User
import com.gxq.learn.di.model.Country

// Interface
trait UserInformationComponent {
  //需要创建的组件
  def userInformation(user: User):UserInformation

  trait UserInformation {
    def userCountry: Country
  }
}