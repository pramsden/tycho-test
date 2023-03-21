# TYCHO TEST

A collection of projects to test a tycho build of a simple RCP app.

## pomless build

This is set by `tycho-pomless` in `.mvn/extensions.xml`.

## jaxws

The app is targeted at Java 17. JAX-WS is add via a `system.bundle` fragment in
the `j17-jaxws-fragment` project.

## feature

A feature is added just to make it all more realistic.

## the app

The app simply starts up and adds a view. The view calls the web service in `j17-model`
which adds 2 numbers. The result is shown in the console. 