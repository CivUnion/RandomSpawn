plugins {
	id("io.papermc.paperweight.userdev") version "1.3.8"
}

dependencies {
    paperDevBundle("1.18.1-R0.1-SNAPSHOT")
	compileOnly("net.civmc.civmodcore:CivModCore:2.4.0:dev-all")
    compileOnly("net.civmc.worldborder:WorldBorder:3.1.0:dev")
	compileOnly("net.civmc.bastion:Bastion:3.1.0:dev")
    compileOnly("net.civmc.banstick:BanStick:2.1.0:dev")
}