# Base this image on core-image-minimal
include recipes-core/images/core-image-base.bb

# Include modules in rootfs
IMAGE_INSTALL += " \
	kernel-modules \
	qtbase \
	qtwebengine \
	iw \
	module-init-tools \
	bluez5 \
	i2c-tools \
	linux-firmware-rpidistro-bcm43430 \
	linux-firmware-rpidistro-bcm43455 \
	bluez-firmware-rpidistro-bcm43430a1-hcd \
	bluez-firmware-rpidistro-bcm4345c0-hcd \
	"
