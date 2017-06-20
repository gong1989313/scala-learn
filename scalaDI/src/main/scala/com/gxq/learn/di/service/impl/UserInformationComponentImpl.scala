package com.gxq.learn.di.service.impl

import com.gxq.learn.di.model.Country
import com.gxq.learn.di.model.User
import com.gxq.learn.di.repository.CountryRepositoryComponent
import com.gxq.learn.di.service.UserInformationComponent

// Implementation
trait UserInformationComponentImpl
                extends UserInformationComponent {
   // Dependencies依赖
   this: CountryRepositoryComponent =>
 
   def userInformation(user: User) = new UserInformationImpl(user)
 
   class UserInformationImpl(val user: User) extends UserInformation {
      def userCountry: Country = {
         // Using the dependency使用依赖
         countryRepository.findByEmail(user.username)
      }
   }
}