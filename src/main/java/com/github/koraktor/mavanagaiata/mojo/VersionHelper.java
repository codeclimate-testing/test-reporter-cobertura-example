/**
 * This code is free software; you can redistribute it and/or modify it under
 * the terms of the new BSD License.
 *
 * Copyright (c) 2014, Sebastian Staudt
 */

package com.github.koraktor.mavanagaiata.mojo;

/**
 * Helper class that provides the current version of Mavanagaiata to the mojo
 * instances
 *
 * @author Sebastian Staudt
 */
class VersionHelper {

    /**
     * Returns the current version of Mavanagaiata
     *
     * This requires the presence of the generated Git info class. If it's not
     * available <code>null</code> is returned.
     *
     * @return The current version
     */
    static String getVersion() {
        try {
            Class<?> gitInfo = Class.forName(VersionHelper.class.getPackage().getName() + ".GitInfo");
            return (String) gitInfo.getMethod("getVersion").invoke(null);
        } catch (Exception e) {
            return null;
        }
    }

}
