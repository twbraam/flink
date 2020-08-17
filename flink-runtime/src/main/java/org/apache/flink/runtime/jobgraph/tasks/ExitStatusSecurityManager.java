package org.apache.flink.runtime.jobgraph.tasks;

import java.security.Permission;

public class ExitStatusSecurityManager extends SecurityManager {
	@Override public void checkExit(int status) {
		throw new SecurityException();
	}

	@Override public void checkPermission(Permission perm) {
		// Allow other activities by default
	}
}
