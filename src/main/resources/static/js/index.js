// // // // document.addEventListener("DOMContentLoaded", theDomHasLoaded, false);
// // // // // window.addEventListener("load", pageFullyLoaded, false);
// // // //
// // // //
// // // // function theDomHasLoaded(e) {
// // // //   // do something
// // // //   // UI elements
// // // //   var donateSection = document.getElementById("pay");
// // // //   console.log(donateSection)
// // // //   var donateButton = document.getElementById('payButton');
// // // //   console.log(donateButton)
// // // //   var unsupportedMsg = document.getElementById('unsupported');
// // // //   console.log(unsupportedMsg)
// // // //   var successMsg = document.getElementById('success');
// // // //   console.log(successMsg)
// // // //   var errorMsg = document.getElementById('error');
// // // //   console.log(errorMsg)
// // // // }
// // // //
// // // //
// // // // // UI elements
// // // // var donateSection = document.getElementById("pay");
// // // // console.log(donateSection)
// // // // var donateButton = document.getElementById('payButton');
// // // // console.log(donateButton)
// // // // var unsupportedMsg = document.getElementById('unsupported');
// // // // console.log(unsupportedMsg)
// // // // var successMsg = document.getElementById('success');
// // // // console.log(successMsg)
// // // // var errorMsg = document.getElementById('error');
// // // // console.log(errorMsg)
// // // //
// // // // donateSection.hidden = true;
// // // // /**
// // // //  * Configuration for our payment. Notes:
// // // //  *   - basic-card: We're taking a card payment. Other options may come in the future.
// // // //  *   - We duplicate the payment network names in supportedMethods, to support older format (Samsung Internet v5.0)
// // // //  *   - The spec includes 'supportedTypes' (credit/debit/prepaid) but this does not have browser support yet
// // // //  *   - These are example payment networks. Others are available! See:
// // // //  *     https://developers.google.com/web/fundamentals/discovery-and-monetization/payment-request/#methoddata-parameter
// // // //  */
// // // // var methodData = [{
// // // //   supportedMethods: ['basic-card', 'visa', 'mastercard', 'amex'],
// // // //   data: {
// // // //     supportedNetworks: ['visa', 'mastercard', 'amex']
// // // //   }
// // // // }];
// // // //
// // // // var details = {total: {label: 'Test payment', amount: {currency: 'GBP', value: '1.00'}}};
// // // //
// // // // // Check that the Payment Request API is available on this device
// // // // if (window.PaymentRequest) {
// // // //   // Show donate button
// // // //   document.getElementById("pay").style.display = 'block';
// // // //   unsupportedMsg.style.display = 'none';
// // // // }
// // // // else {
// // // //   // Show unsupported message
// // // //   donateSection.style.display = 'none';
// // // //   unsupportedMsg.style.display = 'block';
// // // // }
// // // //
// // // // /**
// // // //  * Here is where we would send the payment info to the server / payment gateway for processing,
// // // //  * but I'm not quite ready to take real money from you yet 😉 Simulating by just waiting 2 secs.
// // // //  */
// // // // function processPaymentDetails(uiResult) {
// // // //   return new Promise(function (resolve) {
// // // //     setTimeout(function() {
// // // //       resolve(uiResult);
// // // //     }, 2000);
// // // //   });
// // // // }
// // // //
// // // // function showSuccess() {
// // // //   donateButton.style.display = 'none';
// // // //   errorMsg.style.display = 'none';
// // // //   successMsg.style.display = 'block';
// // // // }
// // // //
// // // // function showError() {
// // // //   donateButton.style.display = 'none';
// // // //   errorMsg.style.display = 'block';
// // // //   successMsg.style.display = 'none';
// // // // }
// // // //
// // // // function onDonateButtonClick() {
// // // //   console.log("now the button click works in old method")
// // // //
// // // //   // Initialise the PaymentRequest with our configuration
// // // //   // We could also pass in additional options as a 3rd parameter here, such as:
// // // //   // {requestShipping: true, requestPayerEmail: true, requestPayerPhone: true};
// // // //   var paymentRequest = new PaymentRequest(methodData, details);
// // // //
// // // //   // Show the native UI
// // // //   paymentRequest.show()
// // // //     .then(function(uiResult) {
// // // //       processPaymentDetails(uiResult)
// // // //         .then(function(uiResult) {
// // // //           uiResult.complete('success');
// // // //           showSuccess();
// // // //         });
// // // //     })
// // // //     .catch(function(error) {
// // // //       console.warn('Unable to complete purchase', error);
// // // //       // D'oh. Inform the user the purchase could not be completed...
// // // //       showError();
// // // //     });
// // // // }
// // // //
// // // // donateButton.addEventListener('click', onDonateButtonClick);
// // // //
// // // // function test() {
// // // //   console.log("now the button click works")
// // // // }
// // //
// // //
// // // // UI elements
// // // var donateSection = document.getElementById('donate');
// // // var donateButton = document.getElementById('donate-button');
// // // var unsupportedMsg = document.getElementById('unsupported');
// // // var successMsg = document.getElementById('success');
// // // var errorMsg = document.getElementById('error');
// // // //
// // // //
// // // // UI elements
// // // // var donateSection = document.getElementById("pay");
// // // console.log(donateSection)
// // // // var donateButton = document.getElementById('payButton');
// // // console.log(donateButton)
// // // // var unsupportedMsg = document.getElementById('unsupported');
// // // console.log(unsupportedMsg)
// // // // var successMsg = document.getElementById('success');
// // // console.log(successMsg)
// // // // var errorMsg = document.getElementById('error');
// // // console.log(errorMsg)
// // //
// // // /**
// // //  * Configuration for our payment. Notes:
// // //  *   - basic-card: We're taking a card payment. Other options may come in the future.
// // //  *   - We duplicate the payment network names in supportedMethods, to support older format (Samsung Internet v5.0)
// // //  *   - The spec includes 'supportedTypes' (credit/debit/prepaid) but this does not have browser support yet
// // //  *   - These are example payment networks. Others are available! See:
// // //  *     https://developers.google.com/web/fundamentals/discovery-and-monetization/payment-request/#methoddata-parameter
// // //  */
// // //
// // // // Check that the Payment Request API is available on this device
// // // if (window.PaymentRequest) {
// // //   // Show donate button
// // //   donateSection.style.display = 'block';
// // //   unsupportedMsg.style.display = 'none';
// // // }
// // // else {
// // //   // Show unsupported message
// // //   donateSection.style.display = 'none';
// // //   unsupportedMsg.style.display = 'block';
// // // }
// // //
// // // /**
// // //  * Here is where we would send the payment info to the server / payment gateway for processing,
// // //  * but I'm not quite ready to take real money from you yet 😉 Simulating by just waiting 2 secs.
// // //  */
// // // function processPaymentDetails(uiResult) {
// // //   return new Promise(function (resolve) {
// // //     setTimeout(function() {
// // //       resolve(uiResult);
// // //     }, 2000);
// // //   });
// // // }
// // //
// // // function showSuccess() {
// // //   donateButton.style.display = 'none';
// // //   errorMsg.style.display = 'none';
// // //   successMsg.style.display = 'block';
// // // }
// // //
// // // function showError() {
// // //   donateButton.style.display = 'none';
// // //   errorMsg.style.display = 'block';
// // //   successMsg.style.display = 'none';
// // // }
// // //
// // // function onDonateButtonClick() {
// // //     var methodData = [{
// // //         supportedMethods: ['basic-card', 'visa', 'mastercard', 'amex'],
// // //         data: {
// // //             supportedNetworks: ['visa', 'mastercard', 'amex']
// // //         }
// // //     }];
// // //
// // //     var details = {total: {label: 'Test payment', amount: {currency: 'GBP', value: '1.00'}}};
// // //
// // //
// // //     // Initialise the PaymentRequest with our configuration
// // //   // We could also pass in additional options as a 3rd parameter here, such as:
// // //   // {requestShipping: true, requestPayerEmail: true, requestPayerPhone: true};
// // //   var paymentRequest = new PaymentRequest(methodData, details);
// // //
// // //   // Show the native UI
// // //   paymentRequest.show()
// // //       .then(function(uiResult) {
// // //         processPaymentDetails(uiResult)
// // //             .then(function(uiResult) {
// // //               uiResult.complete('success');
// // //               showSuccess();
// // //             });
// // //       })
// // //       .catch(function(error) {
// // //         console.warn('Unable to complete purchase', error);
// // //         // D'oh. Inform the user the purchase could not be completed...
// // //         showError();
// // //       });
// // // }
// // //
// // // donateButton.addEventListener('click', onDonateButtonClick);
// // //
// // // // function test() {
// // // //     console.log("now the button gets clicked")
// // // // }
// //
// //
// // // UI elements
// // var donateSection = document.getElementById('donate');
// // var donateButton = document.getElementById('donate-button');
// // var unsupportedMsg = document.getElementById('unsupported');
// // var successMsg = document.getElementById('success');
// // var errorMsg = document.getElementById('error');
// //
// // /**
// //  * Configuration for our payment. Notes:
// //  *   - basic-card: We're taking a card payment. Other options may come in the future.
// //  *   - We duplicate the payment network names in supportedMethods, to support older format (Samsung Internet v5.0)
// //  *   - The spec includes 'supportedTypes' (credit/debit/prepaid) but this does not have browser support yet
// //  *   - These are example payment networks. Others are available! See:
// //  *     https://developers.google.com/web/fundamentals/discovery-and-monetization/payment-request/#methoddata-parameter
// //  */
// // var methodData = [{
// //     supportedMethods: ['basic-card', 'visa', 'mastercard', 'amex'],
// //     data: {
// //         supportedNetworks: ['visa', 'mastercard', 'amex']
// //     }
// // }];
// //
// // var details = {
// //     displayItems: [
// //         {
// //             label: 'Test item',
// //             amount: {currency: 'GBP', value: '0.83'}
// //         },
// //         {
// //             label: 'Test tax',
// //             amount: {currency: 'GBP', value: '0.17'}
// //         }
// //     ],
// //     total: {label: 'Test payment', amount: {currency: 'GBP', value: '0.99'}},
// //     // If you include requestShipping then you need at least one shipping option
// //     // NB. If you have multiple options you can handle the selection by adding a
// //     // 'shippingoptionchange' event handler
// //     shippingOptions: [
// //         {
// //             id: 'free',
// //             label: 'Free shipping',
// //             amount: {currency: 'GBP', value: '0.00'},
// //             selected: true
// //         }
// //     ]
// // };
// // var options = {
// //     requestPayerName: true,
// //     requestPayerEmail: true,
// //     requestPayerPhone: true,
// //     requestShipping: true,
// //     shippingType: 'delivery'
// // };
// //
// // var paymentRequest;
// //
// // // Check that the Payment Request API is available on this device
// // if (window.PaymentRequest) {
// //
// //     var paymentRequest;
// //
// //     var methodData = [{
// //         supportedMethods: ['basic-card', 'visa', 'mastercard', 'amex'],
// //         data: {
// //             supportedNetworks: ['visa', 'mastercard', 'amex']
// //         }
// //     }];
// //
// //     var details = {
// //         displayItems: [
// //             {
// //                 label: 'Test item',
// //                 amount: {currency: 'GBP', value: '0.83'}
// //             },
// //             {
// //                 label: 'Test tax',
// //                 amount: {currency: 'GBP', value: '0.17'}
// //             }
// //         ],
// //         total: {label: 'Test payment', amount: {currency: 'GBP', value: '0.99'}},
// //         // If you include requestShipping then you need at least one shipping option
// //         // NB. If you have multiple options you can handle the selection by adding a
// //         // 'shippingoptionchange' event handler
// //         shippingOptions: [
// //             {
// //                 id: 'free',
// //                 label: 'Free shipping',
// //                 amount: {currency: 'GBP', value: '0.00'},
// //                 selected: true
// //             }
// //         ]
// //     };
// //     var options = {
// //         requestPayerName: true,
// //         requestPayerEmail: true,
// //         requestPayerPhone: true,
// //         requestShipping: true,
// //         shippingType: 'delivery'
// //     };
// //     // Initialise the PaymentRequest with our configuration
// //     paymentRequest = new PaymentRequest(methodData, details, options);
// //     enablePaymentUI();
// // } else {
// //     disablePaymentUI();
// // }
// //
// // function enablePaymentUI() {
// //     donateSection.style.display = 'block';
// //     unsupportedMsg.style.display = 'none';
// // }
// //
// // function disablePaymentUI() {
// //     donateSection.style.display = 'none';
// //     unsupportedMsg.style.display = 'block';
// // }
// //
// // /**
// //  * Here is where we would send the payment info to the server / payment gateway for processing,
// //  * but I'm not quite ready to take real money from you yet 😉 Simulating by just waiting 2 secs.
// //  */
// // function processPaymentDetails(uiResult) {
// //     return new Promise(function (resolve) {
// //         setTimeout(function() {
// //             resolve(uiResult);
// //         }, 2000);
// //     });
// // }
// //
// // function showSuccess() {
// //     donateButton.style.display = 'none';
// //     errorMsg.style.display = 'none';
// //     successMsg.style.display = 'block';
// // }
// //
// // function showError() {
// //     donateButton.style.display = 'none';
// //     errorMsg.style.display = 'block';
// //     successMsg.style.display = 'none';
// // }
// //
// // function onDonateButtonClick() {
// //
// //     // paymentRequest.addEventListener('shippingaddresschange', function(evt) {
// //     //     // Omitting for this demo, but we could process any changes to
// //     //     // e.g. delivery costs, due to the shipping address changing here.
// //     //     console.log('Shipping address changed', evt);
// //     // });
// //
// //     // Show the native UI
// //     paymentRequest.show()
// //         .then(function(uiResult) {
// //             processPaymentDetails(uiResult)
// //                 .then(function(uiResult) {
// //                     uiResult.complete('success');
// //                     showSuccess();
// //                 });
// //         })
// //         .catch(function(error) {
// //             console.warn('Unable to complete purchase', error);
// //             // D'oh. Inform the user the purchase could not be completed...
// //             showError();
// //         });
// // }
// //
// // // donateButton.addEventListener('click', onDonateButtonClick);
// function onBuyClicked() {
//     if (!window.PaymentRequest) {
//         // PaymentRequest API is not available. Forwarding to
//         // legacy form based experience.
//         location.href = '/checkout';
//         return;
//     }
//
//     // Supported payment methods
//     var supportedInstruments = [{
//         supportedMethods: ['basic-card']
//         data: {
//             supportedNetworks: [
//                 'visa', 'mastercard', 'amex', 'discover',
//                 'diners', 'jcb', 'unionpay'
//             ]
//         }
//     }];
//
//     // Checkout details
//     var details = {
//         displayItems: [{
//             label: 'Original donation amount',
//             amount: { currency: 'USD', value: '65.00' }
//         }, {
//             label: 'Friends and family discount',
//             amount: { currency: 'USD', value: '-10.00' }
//         }],
//         total: {
//             label: 'Total due',
//             amount: { currency: 'USD', value : '55.00' }
//         }
//     };
//
//     // 1. Create a `PaymentRequest` instance
//     var request = new PaymentRequest(supportedInstruments, details);
//
//     // 2. Show the native UI with `.show()`
//     request.show()
//     // 3. Process the payment
//         .then(result => {
//         // POST the payment information to the server
//         return fetch('/pay', {
//             method: 'POST',
//             credentials: 'include',
//             headers: {
//                 'Content-Type': 'application/json'
//             },
//             body: JSON.stringify(result.toJSON())
//         }).then(response => {
//             // 4. Display payment results
//             if (response.status === 200) {
//         // Payment successful
//         return result.complete('success');
//     } else {
//         // Payment failure
//         return result.complete('fail');
//     }
// }).catch(() => {
//         return result.complete('fail');
// });
// });
// }
//
// document.querySelector('#start').addEventListener('click', onBuyClicked);

function payment(amount) {
    console.log("yeah it is working")
    var supportedInstruments = [{
        supportedMethods: 'basic-card',
        data: {
            supportedNetworks: ['visa', 'mastercard', 'amex', 'jcb',
                'diners', 'discover', 'mir', 'unionpay']
        }
    }];

    var details = {
        total: {label: 'Total amount', amount: {currency: 'LKR', value: amount}},
        // displayItems: [
        //     {
        //         label: 'Original donation amount',
        //         amount: {currency: 'LKR', value: amount}
        //     }
        // ],
        shippingOptions: [
            {
                id: 'standard',
                label: 'Standard shipping',
                amount: {currency: 'LKR', value: '0.00'},
                selected: true
            }
        ]
    };

    var options = {requestShipping: false};

    try {
        var request = new PaymentRequest(supportedInstruments, details, options);
        // Add event listeners here.
        // Call show() to trigger the browser's payment flow.
        // request.show()
        // request.show().then(function (paymentResponse) {
        //     paymentResponse.complete('success')

        // })
        request.show().then(function(instrumentResponse) {
            var fetchOptions = {
                method: 'GET',
                // credentials: include,
                body: JSON.stringify(paymentResponse)
            };
            // Do something with the response from the UI.
            if (instrumentResponse != null){
                paymentResponse.complete("success");
                console.log(instrumentResponse)
                console.log("in if condition")
                // return true;
            } else {
                console.log("response not got")
                console.log("in else condition")
            }
        })
            .catch(function(err) {
                // Do something with the error from request.show().
                // paymentResponse.complete("success");
                console.log("in inner catch condition")
                // var jsonfile= {json:JSON.stringify(contents)};
                $.ajax({
                    type:'POST',
                    url: "/ticket",
                    // data: jsonfile,
                    dataType: "json"
                });
            });
    } catch (e) {
        // Catch any other errors.
        // paymentResponse.complete("success");
        console.log("Now in catch block")
        console.log("in outer catch condition")
    }
    // alert("Payment successfully completed")
}

function dummypayment(amount) {
    // Initialization of PaymentRequest arguments are excerpted for the
//   sake of brevity.
    console.log("yeah it is working")
    var supportedInstruments = [{
        supportedMethods: 'basic-card',
        data: {
            supportedNetworks: ['visa', 'mastercard', 'amex', 'jcb',
                'diners', 'discover', 'mir', 'unionpay']
        }
    }];

    var details = {
        total: {label: 'Total amount', amount: {currency: 'LKR', value: amount}},
        // displayItems: [
        //     {
        //         label: 'Original donation amount',
        //         amount: {currency: 'LKR', value: amount}
        //     }
        // ],
        shippingOptions: [
            {
                id: 'standard',
                label: 'Standard shipping',
                amount: {currency: 'LKR', value: '0.00'},
                selected: true
            }
        ]
    };

    var options = {requestShipping: false};

    var payment = new PaymentRequest(supportedInstruments, details, options);

    payment.show().then(function(paymentResponse) {
        var fetchOptions = {
            method: 'GET',
            // credentials: include,
            body: JSON.stringify(paymentResponse)
        };
        var serverPaymentRequest = new Request('http://localhost:8080');
    //     fetch(serverPaymentRequest, fetchOptions).then( response => {
    //         if (response.status == 405){
    //             paymentResponse.complete("success")
    //     }
    //         paymentResponse.complete("success");
    //     //     if (response.status < 400) {
    //     //     paymentResponse.complete("success");
    //     // } else {
    //     //     paymentResponse.complete("fail");
    //     // };
    // }).catch( reason => {
    //         paymentResponse.complete("fail");
    // });
    // });
        if (serverPaymentRequest !== undefined) {
            paymentResponse.complete("success");
            alert("Payment successfullt completed")
            // serverPaymentRequest.then(_ => {
            //     // Autoplay started!
            //     paymentResponse.complete("success")
            // }).catch(error => {
            //     // Autoplay was prevented.
            //     // Show a "Play" button so that user can start playback.
            //     paymentResponse.complete("success")
            // });
        }
});
}

async function runManualTest({ completeWith: result }, button) {
    button.disabled = true;
    const { response, request } = await getPaymentRequestResponse();
    promise_test(async () => {
        try {
            // We .complete() as normal, using the passed test value
            const promise = response.complete(result);
    assert_true(promise instanceof Promise, "returns a promise");
    const returnedValue = await promise;
    assert_equals(
        returnedValue,
        undefined,
        "Returned value must always be undefined"
    );
    // We now call .complete() again, to force an exception
    // because [[completeCalled]] is true.
    try {
        await response.complete(result);
        assert_unreached("Expected InvalidStateError to be thrown");
    } catch (err) {
        assert_equals(
            err.code,
            DOMException.INVALID_STATE_ERR,
            "Must throw an InvalidStateError"
        );
    }
    button.innerHTML = '✅  ${button.textContent}';
} catch (err) {
        button.innerHTML = '❌  ${button.textContent}';
        assert_unreached("Unexpected exception: " + err.message);
    }
}, button.textContent.trim());
}


function showTicket() {
    console.log("in inner catch condition")
    // var jsonfile= {json:JSON.stringify(contents)};
    $.ajax({
        type:'POST',
        url: "/ticket",
        // data: jsonfile,
        dataType: "json"
    });
    
}