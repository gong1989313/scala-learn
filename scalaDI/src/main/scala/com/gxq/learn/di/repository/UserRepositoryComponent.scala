package com.gxq.learn.di.repository

import com.gxq.learn.di.model.User

trait UserRepositoryComponent { // For expressing dependencies
  def userRepository: UserRepository // Way to obtain the dependency

  trait UserRepository { // Interface exposed to the user
    def find(username: String): User
  }
}