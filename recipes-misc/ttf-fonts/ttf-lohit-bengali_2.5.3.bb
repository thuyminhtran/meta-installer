DESCRIPTION = "Lohit TrueType font for Bengali Language"
HOMEPAGE = "https://fedorahosted.org/lohit/"
LICENSE = "OFL-1.1"
DEPENDS = "fontforge-native"
PR = "r0"

FONTNAME="lohit-bengali"
FONTCONF="66-${FONTNAME}.conf"

LIC_FILES_CHKSUM="file://COPYRIGHT;md5=ce967831f2feec5293f4038a8cf449e2 \
                  file://OFL.txt;md5=e56537d157e0ee370c0d8468da33e245"
SRC_URI = "https://fedorahosted.org/releases/l/o/lohit/${FONTNAME}-${PV}.tar.gz"
SRC_URI[md5sum] = "9870b09ba4e085eff7306c3b90fee04f"
SRC_URI[sha256sum] = "ba4ac98b36a6e0e98d2583b194a027b4e9c2b909adb19342c9586be27c7bd14c"

S = "${WORKDIR}/${FONTNAME}-${PV}"

do_install() {
    install -m 0755 -d ${D}${datadir}/fonts/${FONTNAME}
    install -m 0644 -p ${S}/*.ttf ${D}${datadir}/fonts/${FONTNAME}

    install -m 0755 -d ${D}${datadir}/fontconfig/conf.avail \
                       ${D}${sysconfdir}/fonts/confd.d

    install -m 0644 -p ${S}/${FONTCONF} \
            ${D}${datadir}/fontconfig/conf.avail/${FONTCONF}
    ln -s ${datadir}/fontconfig/conf.avail/${FONTCONF} \
          ${D}${sysconfdir}/fonts/confd.d/${FONTCONF}
}

FILES_${PN} += "${datadir}"