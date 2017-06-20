package com.gxq.learn.di.repository.impl

import com.gxq.learn.di.model.Country
import com.gxq.learn.di.repository.CountryRepositoryComponent

trait CountryRepositoryComponentImpl
    extends CountryRepositoryComponent {
  def countryRepository = new CountryRepositoryImpl

  class CountryRepositoryImpl extends CountryRepository {
    def findByEmail(countryName: String): Country = {
      println("Find with Hibernate: " + countryName)
      new Country(countryName)
    }
  }
}