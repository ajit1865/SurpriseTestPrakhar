class SumOfElementsOfList {

  //sumOfList method calculates sum of all elements in list
  def sumOfList(orgList: List[Int]): Int = {
    if (orgList.isEmpty) 0
    else
      orgList.head + sumOfList(orgList.tail)
  }

}