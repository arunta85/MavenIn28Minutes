package com.in28minutes.maven;

public class UseSnapshot {
	public static void main(String[] args) {
		// Change this to any FQN that exists in your 1.0-SNAPSHOT jar
		String fqn = System.getProperty("snapshot.class", "com.in28minutes.core.CoreApp");
		try {
			Class<?> clazz = Class.forName(fqn);
			Object instance = clazz.getDeclaredConstructor().newInstance();
			System.out.println("Loaded: " + clazz.getName());
			System.out.println("From: " + clazz.getProtectionDomain().getCodeSource().getLocation());
			System.out.println("Instance: " + instance);
		} catch (Throwable t) {
			System.err.println("Failed to load class " + fqn + ": " + t.getClass().getSimpleName() + " - " + t.getMessage());
		}
	}
}
