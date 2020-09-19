SUMMARY = "Fullscreen browser"
HOMEPAGE = "https://github.com/raphexion/webfocus"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS += "qtwebengine"

SRC_URI = "git://github.com/raphexion/webfocus.git;protocol=https"
SRCREV = "60ecdbd7895872599111369a3ea866e22d987f19"
S = "${WORKDIR}/git"
PV = "0.0+git${SRCPV}"

inherit qmake5

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"

RDEPENDS_${PN} += " \
    liberation-fonts \
    qtdeclarative-qmlplugins \
    qtquickcontrols-qmlplugins \
    qtvirtualkeyboard \
    qtwebengine-qmlplugins \
"

RDEPENDS_${PN} += "qtwebengine"
FILES_${PN} += " \
    /opt/webfocus/bin/webfocus \
"
