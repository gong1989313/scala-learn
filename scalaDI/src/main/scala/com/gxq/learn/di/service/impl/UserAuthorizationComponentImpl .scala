package com.gxq.learn.di.service.impl

import com.gxq.learn.di.service.UserAuthorizationComponent
import com.gxq.learn.di.repository.UserRepositoryComponent
import com.gxq.learn.di.model.User

// Component implementation
trait UserAuthorizationComponentImpl
    extends UserAuthorizationComponent {
  // Dependencies依赖
  this: UserRepositoryComponent =>

  def userAuthorization = new UserAuthorizationImpl

  class UserAuthorizationImpl extends UserAuthorization {
    def authorize(user: User) {
      println("Authorizing " + user.username)
      // Obtaining the dependency and calling a method on it
      userRepository.find(user.username)
    }
  }
}