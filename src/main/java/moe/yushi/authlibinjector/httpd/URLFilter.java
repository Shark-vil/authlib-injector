package moe.yushi.authlibinjector.httpd;

import java.util.Optional;

import moe.yushi.authlibinjector.internal.fi.iki.elonen.IHTTPSession;
import moe.yushi.authlibinjector.internal.fi.iki.elonen.Response;

public interface URLFilter {

	boolean canHandle(String domain, String path);

	Optional<Response> handle(String domain, String path, IHTTPSession session);
}
