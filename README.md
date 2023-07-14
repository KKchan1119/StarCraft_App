# StarCraft_App


게임에 나오는 유닛 Medic을 클래스로 표현함.
Medic의 최고 조상은 Unit클래스이고 유닛의 종류는 지상유닛(Ground Unit)임.
Ground Unit을 상속받아 Medic클래스 생성.
Medic 유닛에 Heal 기능 추가후 GroundUnit 에만 적용되도록 구현.

Terran -GroundUnit
  -Medic

unInterface
  -Healable

Test
  -StarCraftAppTest
    -추가-
    StarCraftAppTest에서 Medic 유닛의 Heal 기능을 지상유닛(Ground Unit)에만 적용되도록 구현
