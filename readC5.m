function[correctionRate]=readC5(C5)
%%
%C5 is the digital chromosome which tries to correct som effect from
%mutations, it doesn't work perfectly but it may diminish some effects. C5
%has a row for every dig-chrom of the criature inlcuiding itself. It has 5
%columns, the first 4 bits plus an extra '1' is the inverse of the
%porbability of correction, it goes from 1/bin2dec(11111) to 1. The last 3
%bits codify the number of times the correction will execute, will more the
%best, because the correction is made by the roun of the mean value of the
%copies of the genes, seven times makes the correction closer to the
%original value.
%%

correctionRate=zeros(5,2);%col1 correction rates, col2 quantity of corrections
if isempty(C5)
    return;
else
    [m,n]=size(C5);
    if(m>=5&n==7)
        correctionRate=zeros(m,2);
        for i=1:m
            correctionRate(i,1)=1/bin2dec(strcat(num2str(full(C5(i,1:4))),"1"));
            correctionRate(i,2)=bin2dec(num2str(full(C5(i,5:7))));
        end
    else
        return;
    end
end
    