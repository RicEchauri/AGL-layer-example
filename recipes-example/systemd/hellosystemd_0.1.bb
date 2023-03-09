SUMMARY = "Systemd example recipe"
DESCRIPTION = "Systemd service example for xxx"
LICENSE = "CLOSED"

inherit systemd
NATIVE_SYSTEMD_SUPPORT = "1"
SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE:${PN} = "hello.service"

SRC_URI += "file://hello.service"

FILES:${PN} += "${systemd_unitdir}/system/hello.service"

S = "${WORKDIR}"


do_install:append(){
    # Install systemd stuff
    install -d ${D}${systemd_unitdir}/system
    install -m 0644 ${WORKDIR}/hello.service ${D}${systemd_unitdir}/system
}
#RDEPENDS:${PN} = "helloworld"
# Systemd class stuff
