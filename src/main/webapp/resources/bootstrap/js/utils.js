$(function() {

	$("#region")
			.change(
					function() {						
						$('#province').html('');
						var state = {
								//restutise region:region
								"region": $("#region").val()
						};
						
						$
								.ajax({
									url : "readProvince",
									data : JSON.stringify(state),
									dataType : 'json',
									contentType : 'application/json',
									type : 'POST',
									async : true,
									success : function(res) {
										
										console.log(res.provinceList.length);
										$('#province')
												.append(
														'<option value= "seleziona provincia">Seleziona Provincia</option>');
										for (var i = 0; i < res.provinceList.length; i++) {
											console.log(" "
													+ res.provinceList[i]);
											$('#province')
													.append(
															'<option value='
																	+ res.provinceList[i]
																	+ '>'
																	+ res.provinceList[i]
																	+ '</option>');
										}
									}

								});
					});
});
$(function() {

	$("#province")
			.change(
					function() {
						$('#country').html('');
						var provincia = {
							"province" : $("#province").val()
						};
						
						$
								.ajax({
									url : "readCountry",
									data : JSON.stringify(provincia),
									dataType : 'json',
									contentType : 'application/json',
									type : 'POST',
									async : true,
									success : function(res2) {
										console.log(res2.countries.length);
										$('#country')
												.append(
														'<option value= "seleziona provincia">Seleziona Città</option>');
										for (var i = 0; i < res2.countries.length; i++) {
											console
													.log(" "
															+ res2.countries[i]);
											$('#country').append(
													'<option value='
															+ res2.countries[i]
															+ '>'
															+ res2.countries[i]
															+ '</option>');
										}
									}

								});
					});
});