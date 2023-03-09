DESCRIPTION = "A helloworld desktop program"
PRIORITY = "optional"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://app.desktop"
SRC_URI += "file://dbus-app.service"


S = "${WORKDIR}"

FILES:${PN} += "${datadir}/applications/app.desktop"
FILES:${PN} += "${datadir}/dbus-1/services"

do_install() {
install -d ${D}${datadir}/applications
install -m 0755 ${WORKDIR}/app.desktop ${D}${datadir}/applications

# Install dbus stuff
    install -d ${D}${datadir}/dbus-1/services
    install -m 0644 ${WORKDIR}/dbus-app.service ${D}${datadir}/dbus-1/services
}