$(function() {

	$("#region")
			.change(
					$('#province').html(''),
					function() {
						$.getJSON('readProvince', {
							stateName : $(this).val(),
							ajax : 'true'
						}, function(data) {
							
							var len = data.length;
						
							for ( var i = 0; i < len; i++) {
								$('#province').append(
										'<option value=' + data[i] + '>'
										+ data[i] + '</option>');
							}
							
			 
						});
								
					});
});
$(function() {

	$("#province")
			.change(
					$('#county').html(''),
					function() {
						$.getJSON('readCountry', {
							stateName : $(this).val(),
							ajax : 'true'
						}, function(data) {
							
							var len = data.length;
							
							for ( var i = 0; i < len; i++) {
								$('#country').append(
										'<option value=' + data[i] + '>'
										+ data[i] + '</option>');
							}
							
			 
						});
								
					});
});
