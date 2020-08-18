package org.apache.flink.runtime.security;

import java.io.FileDescriptor;
import java.net.InetAddress;
import java.security.Permission;

/**
 * A SecurityManager to fail on user code calling System.exit().
 * */
public class ExitCheckSecurityManager extends SecurityManager {

	@Override
	public void checkExit(int status) {
		throw new SecurityException(String.format("System.exit(%s) called during Task execution.", status));
	}

	@Override
	public final void checkAccept(String host, int port) {
	}

	@Override
	public final void checkAccess(Thread t) {
	}

	@Override
	public final void checkAccess(ThreadGroup g) {
	}

	@Override
	public final void checkAwtEventQueueAccess() {
	}

	@Override
	public final void checkConnect(String host, int port) {
	}

	@Override
	public final void checkConnect(String host, int port, Object context) {
	}

	@Override
	public final void checkCreateClassLoader() {
	}

	@Override
	public final void checkDelete(String file) {
	}

	@Override
	public final void checkExec(String cmd) {
	}

	@Override
	public final void checkLink(String lib) {
	}

	@Override
	public final void checkListen(int port) {
	}

	@Override
	public final void checkMemberAccess(Class<?> clazz, int which) {
	}

	@Override
	public final void checkMulticast(InetAddress maddr) {
	}

	@Override
	public final void checkMulticast(InetAddress maddr, byte ttl) {
	}

	@Override
	public final void checkPackageAccess(String pkg) {
	}

	@Override
	public final void checkPackageDefinition(String pkg) {
	}

	@Override
	public final void checkPermission(Permission perm) {
	}

	@Override
	public final void checkPermission(Permission perm, Object context) {
	}

	@Override
	public final void checkPrintJobAccess() {
	}

	@Override
	public final void checkPropertiesAccess() {
	}

	public final void checkPropertyAccess(String key) {
	}

	@Override
	public final void checkRead(FileDescriptor fd) {
	}

	@Override
	public final void checkRead(String file) {
	}

	@Override
	public final void checkRead(String file, Object context) {
	}

	@Override
	public final void checkSecurityAccess(String target) {
	}

	@Override
	public final void checkSetFactory() {
	}

	@Override
	public final void checkSystemClipboardAccess() {
	}

	@Override
	public final boolean checkTopLevelWindow(Object window) {
		return true;
	}

	@Override
	public final void checkWrite(FileDescriptor fd) {
	}

	@Override
	public final void checkWrite(String file) {
	}
}
