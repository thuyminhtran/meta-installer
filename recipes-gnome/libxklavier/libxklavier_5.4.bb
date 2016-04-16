SUMMARY = "Helper lib for keyboard management"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=6e29c688d912da12b66b73e32b03d812"

DEPENDS = "xkbcomp gtk+ iso-codes libxi libxml2"

inherit autotools pkgconfig gettext gobject-introspection

RDEPENDS_${PN} += "iso-codes xkbcomp"

SRC_URI = " \
    http://pkgs.fedoraproject.org/repo/pkgs/${BPN}/${BPN}-${PV}.tar.bz2/13af74dcb6011ecedf1e3ed122bd31fa/${BPN}-${PV}.tar.bz2 \
    file://fix-do_installer-failure.patch \
"
SRC_URI[md5sum] = "13af74dcb6011ecedf1e3ed122bd31fa"
SRC_URI[sha256sum] = "17a34194df5cbcd3b7bfd0f561d95d1f723aa1c87fca56bc2c209514460a9320"

FILES_${PN} += "${datadir}/*"

