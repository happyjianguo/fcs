define(function(require, exports, module) {

    //必填集合
    require('zyw/requiredRules');
    var _form = $('#form'),
        _allWhetherNull = {
            stringObj: 'level2Name',
            boll: false
        },
        requiredRules = _form.requiredRulesSharp(_allWhetherNull['stringObj'], _allWhetherNull['boll'], {}, function(rules, name) {
            rules[name] = {
                required: true,
                messages: {
                    required: '必填'
                }
            };
        }),
        maxlength20Rules = _form.requiredRulesSharp(_allWhetherNull['stringObj'] + ',level2Description', _allWhetherNull['boll'], {}, function(rules, name) {
            rules[name] = {
                maxlength: 200,
                messages: {
                    maxlength: '已超出200字'
                }
            };
        }),
        _rulesAll = $.extend(true, maxlength20Rules, requiredRules),

        commonTwoHierarchy = require('zyw/customer/cRe.commonTwoHierarchy');

    commonTwoHierarchy({
        form: _form,
        allWhetherNull: _allWhetherNull,
        rulesAll: _rulesAll,
        hintPopup: '请选择增加的一级指标选择项',
        href: 'publicCause.htm?level=3&type=GYWBZ',
        previewHref: 'publicCause.htm?level=3&type=GYWBZ&view=true'
    });



})