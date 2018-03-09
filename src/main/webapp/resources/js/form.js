var now = new moment();

$(function() {
	$('.datepicker').datetimepicker({
        defaultDate: now,
        format: 'DD/MM/YYYY HH:mm'
	});
});



