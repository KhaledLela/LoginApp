var http = require('http');
var postHTML = '<html><head><title>Login Example</title></head>' + '<body>'
		+ '<form id="loginform" action="LoginServlet" method="post">'
		+ '<label for="field">UserName: </label>'
		+ '<input type="text" id="field"' + 'name="uname"> <br>'
		+ '<label for="passwd">Password:</label>'
		+ '<input type="password" class="left" id="passwd" name="pwd"> <br>'
		+ '<input type="submit" value="Submit"></form>' + '</body></html>';

http.createServer(function(req, res) {
	var body = "";
	req.on('data', function(chunk) {
		body += chunk;
	});
	req.on('end', function() {
		console.log('Form Data: ' + body);
		res.writeHead(200);
		res.end(postHTML);
	});
}).listen(8080);
