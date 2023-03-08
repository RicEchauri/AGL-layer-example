DESCRIPTION = "A helloworld desktop program"
PRIORITY = "optional"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://app.desktop "

S = "${WORKDIR}"

FILES:${PN} += "${datadir}/applications/app.desktop"

do_install() {
install -d ${D}${datadir}/applications
install -m 0755 ${WORKDIR}/app.desktop ${D}${datadir}/applications
}