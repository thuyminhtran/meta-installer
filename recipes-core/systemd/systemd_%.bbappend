FILESEXTRAPATHS_prepend_installer := "${THISDIR}/files:"

do_install_append_installer() {
	ln -nsf ${systemd_unitdir}/system/anaconda-init-screen@.service \
		${D}${sysconfdir}/systemd/system/getty.target.wants/getty@tty1.service
}
