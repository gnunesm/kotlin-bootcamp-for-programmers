package Buildings

open class BaseBuildingMaterial(val numberNeeded: Int = 1) {

}

class Wood: BaseBuildingMaterial(4) {

}

class Brick: BaseBuildingMaterial(8) {

}

class Building<out T: BaseBuildingMaterial>(val material: T) {
    val baseMaterialsNeeded = 100

    val actualMaterialsNeeded = baseMaterialsNeeded * material.numberNeeded

    fun build() {
        println("Type of material: ${material::class.simpleName}")
        println("Number needed: $actualMaterialsNeeded")
    }
}

fun <T: BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500)
        println("small building")
    else
        println("large building")
}

fun main(args: Array<String>) {
    val building = Building(Wood())

    building.build()

    isSmallBuilding(building)

}