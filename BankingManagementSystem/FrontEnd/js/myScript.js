// BackEnd URL
const BASE_URL = "http://localhost:9090";

// UI URL
const UI_URL = "http://127.0.0.1:5500";

function doLogin() {

	const email = document.getElementById('email').value;
	const pass = document.getElementById('pass').value;

	//TODO : add validation for each field
	const loginObj = {};

	loginObj.email = email;
	loginObj.password = pass;

	checkLoginAPI(loginObj);

}
async function checkLoginAPI(loginObj) {
	const url = BASE_URL + '/login';

	const data = {
		method: 'POST',
		headers: {
			'Accept': 'application/json',
			'Content-Type': 'application/json'
		},
		body: JSON.stringify(loginObj)
	};
	const rawResponse = await fetch(url, data);
	const content = await rawResponse.json();

	if (content == true) {
		alert('Login Successful');
		window.location.href = UI_URL + '/dashBoard.html';
	}
	else { alert('Login failed'); }


	console.log(content);
}

function openAccount() {

	const firstName = document.getElementById('firstName').value;
	const lastName = document.getElementById('lastName').value;
	const email = document.getElementById('email').value;
	const pass = document.getElementById('pass').value;
	const phone = document.getElementById('phone').value;
	const dob = document.getElementById('dob').value;
	const accountType = document.getElementById('accountType').value;

	//TODO : add validation for each field

	const customerObj = {};
	customerObj.firstName = firstName;
	customerObj.lastName = lastName;
	customerObj.email = email;
	customerObj.phone = phone;
	customerObj.password = pass;
	customerObj.dob = dob;
	customerObj.accountType = accountType;

	addCustomerAPI(customerObj);

}
async function addCustomerAPI(customerObj) {
	const url = BASE_URL + '/customer';

	const data = {
		method: 'POST',
		headers: {
			'Accept': 'application/json',
			'Content-Type': 'application/json'
		},
		body: JSON.stringify(customerObj)
	};
	const rawResponse = await fetch(url, data);
	const customer = await rawResponse.json();

	if (customer) {
		alert('Registraion Successful');
		localStorage.setItem("ACC_NUM", customer.accountNo);
		window.location.href = UI_URL + '/login.html';
	}
	else { alert('Login failed'); }

	console.log(customer);
}

function fetchAccountNum() {
	const span = document.getElementById('accountNum');
	const accountNumber = localStorage.getItem("ACC_NUM");
	span.innerHTML = accountNumber;

}

function deposite() {

	const accountNum = document.getElementById('accNum').value;
	const amount = document.getElementById('amount').value;
	const source = document.getElementById('source').value;
	const remark = document.getElementById('remark').value;

	const transactionObj = {}
	transactionObj.accountNum = accountNum;
	transactionObj.amount = amount;
	transactionObj.source = source;
	transactionObj.remark = remark;
	transactionObj.type = "CREDIT";

	callDepositeAPI(transactionObj);

}

async function callDepositeAPI(transactionObj) {
	const url = BASE_URL + '/deposite';

	const data = {
		method: 'POST',
		headers: {
			'Accept': 'application/json',
			'Content-Type': 'application/json'
		},
		body: JSON.stringify(transactionObj)
	};
	const rawResponse = await fetch(url, data);
	const message = await rawResponse.json();

	alert(message);
	window.location.href = UI_URL + '/dashBoard.html';
	console.log(message);
}