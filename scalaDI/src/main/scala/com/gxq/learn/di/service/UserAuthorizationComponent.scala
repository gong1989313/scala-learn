package com.gxq.learn.di.service

import com.gxq.learn.di.model.User

trait UserAuthorizationComponent {
  def userAuthorization: UserAuthorization

  trait UserAuthorization {
    def authorize(user: User)
  }
}