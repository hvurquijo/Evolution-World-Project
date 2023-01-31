function[copiedChr]=copyChromosome(Chr, correctionR, correctionQ,mutationRate)
%%
%It copies a dig-chrome incluiding the mutations and the corrections
%%
[m,n]=size(Chr);
copiedChr=Chr;
if correctionQ>0
    for j=1:m
        if rand>=correctionR
            for i=1:correctionQ%faz o processo de replicação por cada fila de Chr
                copiedChr(j,:)=copiedChr(j,:)+mutateGene(Chr(j,:),mutationRate);
            end
            copiedChr(j,:)=round(copiedChr(j,:)/(correctionQ+1));
        end
        
    end
    
else
    for j=1:m
         copiedChr(j,:)=mutateGene(copiedChr(j,:),mutationRate);
    end
end
    
