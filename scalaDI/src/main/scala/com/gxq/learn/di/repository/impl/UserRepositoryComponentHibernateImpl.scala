package com.gxq.learn.di.repository.impl

import com.gxq.learn.di.repository.UserRepositoryComponent
import com.gxq.learn.di.model.User

trait UserRepositoryComponentHibernateImpl
    extends UserRepositoryComponent {
  def userRepository = new UserRepositoryImpl

  class UserRepositoryImpl extends UserRepository {
    def find(username: String): User = {
      println("Find with Hibernate: " + username)
      new User(username)
    }
  }
}