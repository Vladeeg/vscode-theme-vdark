// Comment
function foo(param) {
	const text = 'string';
	let fib = [1, 1];
	for (var i = 2; i < param.length; i++) {
		fib.push(fib[i - 1] + fib[i - 2]);
	}
	return {
		"array": fib,
		"text": text,
		"boolean": false
	};
}
