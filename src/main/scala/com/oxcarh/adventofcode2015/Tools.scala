package com.oxcarh.adventofcode2015

import scala.io.Source

object Tools {

  def loadDayInputAsText(day: Int = 0): String = {
    Source.fromInputStream(getClass.getResourceAsStream(s"/input_day$day.txt")).mkString
  }

}

