/* sbt -- Simple Build Tool
 * Copyright 2008, 2009, 2010  Mark Harrah
 */
package xsbti;

public interface Problem
{
	Severity severity();
	String message();
	Position position();
}